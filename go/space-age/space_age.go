// Package space implements aging across the solar system
package space

import "math"

// Planet represents a planet's name
type Planet string

// number of seconds in a year on Earth
const year float64 = 31557600

var years = map[Planet]float64{
	"Earth":   year,
	"Mercury": 0.2408467 * year,
	"Venus":   0.61519726 * year,
	"Mars":    1.8808158 * year,
	"Jupiter": 11.862615 * year,
	"Saturn":  29.447498 * year,
	"Uranus":  84.016846 * year,
	"Neptune": 164.79132 * year,
}

// Age returns one's age on a given planet
func Age(age float64, p Planet) float64 {
	return math.Round(100*age/years[p]) / 100
}
