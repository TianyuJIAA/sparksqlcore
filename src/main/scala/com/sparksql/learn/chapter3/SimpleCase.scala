package com.sparksql.learn.chapter3

import org.apache.spark.sql.SparkSession

object SimpleCase {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.
      builder().
      appName("example").
      master("local").
      config("spark.driver.bindAddress", "127.0.0.1").
      getOrCreate()

    spark.sparkContext.setLogLevel("DEBUG")

    spark.read.json("/Users/jiatianyu/IdeaProjects/Home/sparksqlcore/data/student.json")
      .createTempView("student")

    val frame1 = spark.sql("select name from student where age > 18")
    frame1.show()

    val frame2 = spark.sql("select name from student where id  > 2")
    frame2.show()

    val frame3 = spark.sql("select * from student")
    frame3.show()

  }
}
