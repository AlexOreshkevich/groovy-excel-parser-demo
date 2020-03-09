import extract.excel.ExcelBuilder

new ExcelBuilder("book.xls").eachLine {
  println "First column on row ${it.rowNum} = ${cell(0)}"
}