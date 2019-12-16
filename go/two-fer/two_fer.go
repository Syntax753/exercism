// Package twofer implements sharing with others
package twofer

// ShareWith takes the person you want to share with or the person you're with if left blank
func ShareWith(name string) string {
	with := name

	if name == "" {
		with = "you"
	}

	return "One for " + with + ", one for me."
}
