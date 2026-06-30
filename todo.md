# FitLog TODO

## Foundation
- [x] Design system: dark sport-tech theme, electric lime accent, Space Grotesk + Inter Tight fonts
- [x] i18n: translation keys (UZ default, RU), language context + localStorage persistence
- [x] Storage lib: localStorage helpers (load/save profile, first-launch flag)
- [x] Calculation lib: BMR (Mifflin-St Jeor), TDEE, calories, protein, water, steps

## Onboarding (10 steps)
- [x] Step 1: Welcome screen (bilingual welcome + short explanation)
- [x] Step 2: Language selection (O'zbekcha / Русский)
- [x] Step 3: Personal info (name, gender, age, height, current weight, goal weight)
- [x] Step 4: Activity level (5 options)
- [x] Step 5: Fitness goal (4 options)
- [x] Step 6: Gym schedule (0,1,2,3,4,5+ per week)
- [x] Step 7: Water goal (auto-suggest by weight, editable)
- [x] Step 8: Steps goal (auto-suggest, default 8000, editable)
- [x] Step 9: Calculate automatically (calories, protein, water, steps)
- [x] Step 10: Dashboard ready (Welcome, [Name] + daily targets)
- [x] Progress bar across steps + slide transitions + back/next nav

## Dashboard
- [x] Greeting "Welcome, [Name]"
- [x] Daily Targets: Calories, Protein, Water, Steps (ring gauges + big numbers)
- [x] Reads from localStorage

## Settings
- [x] Edit all personal info, activity, goal, gym, water, steps
- [x] Language selector
- [x] Recalculate targets on save
- [x] Reset onboarding option

## Logic
- [x] Onboarding only on first launch (localStorage flag)
- [x] Save everything in localStorage
- [x] Routing: redirect to onboarding if not completed, else dashboard

## Testing
- [x] Vitest for calculation functions (13 tests passing)
- [x] Manual browser verification (full 10-step flow + settings recalculation)


## Database Schema (Phase 2)
- [x] dailyLogs table: userId, date, calories, protein, water, steps, notes
- [x] workouts table: userId, date, type, duration, intensity, notes
- [x] habits table: userId, habitId, date, completed
- [x] weights table: userId, date, weight

## Daily Logging (Bugun Page)
- [x] Add calories input + quick food suggestions
- [x] Add protein input
- [x] Add water input (with glass counter)
- [x] Add steps input
- [x] Add gym session logging
- [x] Daily summary card
- [x] Save to database

## Tracking Pages
- [x] Vazn (Weight): current, goal, change, history chart, projection
- [x] Tarix (History): daily log entries, filterable by date range
- [x] Statistika (Stats): weekly/monthly charts (calories, protein, water, steps, gym)

## Advanced Features
- [x] Gym Tracker: cardio, strength, flexibility, sports; duration, intensity
- [x] Habit Tracker: sugar-free, no soda, no fast food, 30min walk, 8h sleep
- [x] Streak Counter: current, best, days
- [x] Goal Forecast: projected date to reach goal weight
- [x] Discipline Score: 0-100 (Calories 30%, Protein 25%, Water 15%, Steps 15%, Gym 15%)

## Premium UI Enhancements
- [x] Neon red/orange glow effects on important cards
- [x] Glassmorphism effects (blur, transparency)
- [x] Dark surfaces with ambient glow
- [x] Bottom navigation (Bugun, Statistika, Tarix, Vazn, Sozlamalar)
- [x] Smooth animations + transitions

## Integration & Testing
- [x] Connect all pages to database (tRPC procedures)
- [x] Vitest for new calculation functions (13 tests passing)
- [x] Manual browser verification (onboarding + Bugun routing)
- [x] Performance optimization (lazy loading, memoization, optimized queries)
