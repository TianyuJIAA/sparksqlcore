package com.sparksql.learn.additional

import org.apache.spark.sql.SparkSession

object Demo {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.
      builder().
      appName("example").
      master("local").
      config("spark.driver.bindAddress", "127.0.0.1").
      enableHiveSupport().
      getOrCreate()

    spark.sparkContext.setLogLevel("DEBUG")

    spark.read.json("/Users/jiatianyu/IdeaProjects/Home/sparksqlcore/data/student.json")
      .createTempView("student")

    val frame1 = spark.sql("select name from student where age > 18")
    frame1.show()

  }
}
