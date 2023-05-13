package cor

import "testing"

func TestRegister01(t *testing.T) {
	cashier := &Cashier{}
	doctor := &Doctor{}

	//Set next for doctor department
	doctor.setNext(cashier)

	//Patient visiting
	patient := &Patient{name: "abc"}
	doctor.execute(patient)
}

func TestRegister02(t *testing.T) {
	cashier := &Cashier{}
	doctor := &Doctor{}

	//Set next for doctor department
	doctor.setNext(cashier)

	//Patient visiting
	patient := &Patient{name: "abc", doctorCheckUpDone: true}
	doctor.execute(patient)
}
