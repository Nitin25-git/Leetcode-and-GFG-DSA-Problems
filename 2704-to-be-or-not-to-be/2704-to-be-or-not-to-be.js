/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
  var toBe=(n) =>{
      if(val===n)
           return true;
      else
          throw new Error("Not Equal")
  }
  
  var notToBe=(n)=>{
      if(val!==n)
          return true
      else
          throw new Error("Equal")
  }
  
  return{
      toBe,
      notToBe
  }
    
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */