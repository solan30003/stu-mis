export function statusFormatter(val) {
  var ret = "未知";
  switch (val) {
    case -1:
      ret = "未知";
      break;
    default:
      break;
  }
  return ret;
}
/**
 * boolean值转中文
 * @param {boolean} val bool值
 */
export function booleanFormatter(val) {
  return val === true || val === "true" || val === "y" ? "是" : "否";
}
/**
 * table的boolean列Formatter
 * @param {object} row 行绑定的数
 * @param {object} column 列
 * @param {object} cellValue 单元格值
 */
export function booleanColumnFormatter(row, column, cellValue) {
  return cellValue === true || cellValue === "true" || cellValue === "y" ? "是" : "否";
}
/**
 * table的结束时间列Formatter
 * @param {object} row 行绑定的数
 * @param {object} column 列
 * @param {object} cellValue 单元格值
 */
export function endTimeColumnFormatter(row, column, cellValue) {
  return cellValue === "9999-12-31 00:00:00" ? "" : cellValue;
}
