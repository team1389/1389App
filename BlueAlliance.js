
function getData() {
  var queryString = Math.random();
  var cellFunction = '=IMPORTHTML("https://www.thebluealliance.com/event/2017chcmp#results?' + queryString + '","table",1)';

  SpreadsheetApp.getActiveSheet().getRange('<importcell>').setValue(cellFunction);
}
