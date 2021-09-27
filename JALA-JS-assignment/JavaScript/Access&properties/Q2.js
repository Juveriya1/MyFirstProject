function Stu(){
	let Student={
		fullname: function(){
		return this.Fname+" "+this.Lname;
	
	}
	}


let Std1={
	Fname:"Zuby",
	Lname:"Khan"
	}
let Std2={
	Fname:"Ellie",
	Lname:"John"
	}
	
let x=Student.fullname.call(Std1);
document.write(x);

let y=Student.fullname.apply(Std2);
document.write(y);
	}