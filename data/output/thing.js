var Client = require('mariasql');


this.c = new Client({
  host:'localhost',
  user:'root',
  password:'Rdendow2016',
});
this.c.query('use test2');
this.callStuff = function(callback){
  var tempArr=[];
  this.c.query('select COLUMN_JSON(JSON) as Additional from example',(err,row)=>{
  if(err)
    throw err;
    row.forEach((result)=>{
      tempArr.push(result);
    })
      callback(tempArr);
  })

}


module.exports = this;
module.exports.callStuff = this.callStuff;
