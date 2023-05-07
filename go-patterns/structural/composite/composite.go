package composite

import "fmt"

type Employee struct {
	name, dept string
	employees  []Employee
}

func (e *Employee) append(employee Employee) {
	e.employees = append(e.employees, employee)
}

func (e *Employee) String() string {
	return fmt.Sprintf("name = %s, dept = %s", e.name, e.dept)
}
