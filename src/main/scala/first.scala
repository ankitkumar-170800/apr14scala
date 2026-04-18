import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{col, sum}


object first {

  def main(args: Array[String]): Unit = {



    //    1stway

    val spark = SparkSession.builder()
      .appName("spark-program")
      .master("local[1]")
      .getOrCreate()


    //    val ddlschema="id Int,name String,salary Int,city String"


    val df=spark.read
      .format("csv")
      .option("header",true)
      .option("path","C:/Users/Akanksha/Documents/SeekhoBigdata/info.csv")
      .load()
//
//    val window=Window.orderBy(col("id")).rowsBetween(Window.unboundedPreceding,Window.currentRow)
//
//    val res=df.select(
//
//      col("id"),
//      col("name"),
//      col("salary"),
//      sum(col("salary")).over(window).alias("running salary")
//
//
//
//    ).show()

    df.show()

  }

}