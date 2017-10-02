function doGet(e){
  return handleResponse(e);
}
 
function doPost(e){
  return handleResponse(e);
}


function handleResponse(e) { 
  try{
  var lock = LockService.getPublicLock();
  lock.waitLock(30000);  // wait 30 seconds before conceding defeat.
  Logger.log('begin to work.');
  var sheet1 = SpreadsheetApp.openById("1vSIi4vTvN2unuRytbBgmiKKYIntAS4BoaqczR2lGScA");
  Logger.log(sheet1.getUrl());
  var sheet = SpreadsheetApp.getActiveSpreadsheet().getActiveSheet();

  var headers = sheet.getRange(1, 1, 1, sheet.getLastColumn()).getValues()[0]; //read headers
  var nextRow = sheet.getLastRow(); // get next row
  var cell = sheet.getRange('a1');
  var col = 0;
  for (i in headers){ // loop through the headers and if a parameter name matches the header name insert the value
    Logger.log('header:'+i);
    if (headers[i] == "Timestamp"){
      val = new Date();
    } else {
          val = e.parameter[headers[i]];
       // val = "TEST2";
    }
    cell.offset(nextRow, col).setValue(val);
    col++;
  }
  }
  catch(e){
    // if error return this
    return ContentService
          .createTextOutput(JSON.stringify({"result":"error", "error": e}))
          .setMimeType(ContentService.MimeType.JSON);
  } finally { //release lock
    lock.releaseLock();
     return ContentService
          .createTextOutput("Got it, thank you!")
          .setMimeType(ContentService.MimeType.TEXT);
  }
}
//http://www.google.sc/support/forum/p/apps-script/thread?tid=345591f349a25cb4&hl=en
function setUp() {
  ScriptProperties.setProperty('active', SpreadsheetApp.getActiveSpreadsheet().getId());
}
