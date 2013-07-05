package com.wh.common.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 6, 2013
 * Time: 1:02:50 AM
 */
public class ResultWriter {

  private int flushInterval;
  private int noOfWrites;
  private FileWriter writer;

  public ResultWriter(String filePath) {
    this(filePath, false);
  }

  public ResultWriter(String filePath, int flushInterval) {
    this(filePath, flushInterval, false);
  }

  public ResultWriter(String filePath, boolean overwrite) {
    this(filePath, 1000, overwrite);
  }

  /**
   * @param filePath
   * @param flushInterval no of writes before flushing the data, 0 if flush is not required
   * @param overwrite
   */
  public ResultWriter(String filePath, int flushInterval, boolean overwrite) {
    this.flushInterval = flushInterval;
    try {
      if (overwrite) {
        writer = new FileWriter(filePath);
      } else {
        writer = getFileWriter(filePath);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private FileWriter getFileWriter(String filePath) throws IOException {
    File file = new File(filePath);
    FileWriter writer;
    if (file.exists()) {
      int lastIndexOfDot = filePath.lastIndexOf('.');
      String newFilePath;
      String extension = filePath.substring(lastIndexOfDot + 1);
      Integer fileNumber;
      try {
        fileNumber = Integer.parseInt(extension) + 1;
        newFilePath = filePath.substring(0, lastIndexOfDot) + "." + fileNumber;
      } catch (NumberFormatException e) {
        fileNumber = 1;
        newFilePath = filePath + "." + 1;
      }
      writer = getFileWriter(newFilePath);
    } else {
      writer = new FileWriter(file);
    }
    return writer;
  }

  public ResultWriter append(String data) {
    try {
      writer.append(data);
      if (flushInterval > 0 && ++noOfWrites == flushInterval) {
        flush();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return this;
  }

  public ResultWriter append(Object data) {
    return append(String.valueOf(data));
  }

  public void close() {
    try {
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void flush() {
    try {
      writer.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
