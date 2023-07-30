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

    spark.read.json("/Users/jiatianyu/IdeaProjects/Home/sparksqlcore/data/person.json")
      .createTempView("person")

    spark.sql("select s.name from student s join person p on s.id = p.id where s.age > 10").explain(true)

  }
}
