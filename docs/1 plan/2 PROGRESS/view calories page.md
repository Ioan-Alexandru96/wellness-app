a User can have multiple CaloriesComputation

CaloriesComputation
    age
    gender MALE, FEMALE
    height int
    weight int
    activityLevel   ACTIVE, SEDENTARY

calculator formulas:
bmr:
For men: BMR = 10 x weight (kg) + 6.25 x height (cm) – 5 x age (years) + 5

For women: BMR = 10 x weight (kg) + 6.25 x height (cm) – 5 x age (years) – 161

calorieCalculator:
Sedentary: Calorie-Calculation = BMR x 1.2
Moderate: Calorie-Calculation = BMR x 1.55 
active: Calorie-Calculation = BMR x 1.725
