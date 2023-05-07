package composite

import (
	"fmt"
	"testing"
)

func Test01(t *testing.T) {
	ceo := Employee{
		name: "John",
		dept: "CEO",
	}

	// 销售部
	headSales := Employee{
		name: "Robert",
		dept: "Head Sales",
	}
	salesExecutive1 := Employee{
		name: "Richard",
		dept: "Sales",
	}
	salesExecutive2 := Employee{
		name: "Rob",
		dept: "Sales",
	}
	headSales.append(salesExecutive1)
	headSales.append(salesExecutive2)
	ceo.append(headSales)

	// 市场部
	headMarketing := Employee{
		name: "Michel",
		dept: "Head Marketing",
	}
	clerk1 := Employee{
		name: "Laura",
		dept: "Marketing",
	}
	clerk2 := Employee{
		name: "Bob",
		dept: "Marketing",
	}
	headMarketing.append(clerk1)
	headMarketing.append(clerk2)
	ceo.append(headMarketing)
	fmt.Println(ceo.String())
	for _, head := range ceo.employees {
		fmt.Println(head.String())
		for _, employee := range head.employees {
			fmt.Println(employee.String())
		}
	}
}
