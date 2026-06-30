# FitLog — Onboarding Design Brainstorm

## Three Stylistic Approaches

### 1. "Kinetic Athlete" — Energetic Sport-Tech
A high-contrast, motion-driven aesthetic inspired by Nike Training Club and Apple Fitness — bold display type, electric accent color, dark canvas with vivid energy.
**Probability: 0.07**

### 2. "Calm Coach" — Soft Wellness Minimalism
A gentle, airy wellness look with pastel gradients, soft cards, rounded forms — Calm/Headspace energy. Reassuring, low-pressure.
**Probability: 0.03**

### 3. "Precision Lab" — Data-First Performance Dashboard
A clinical, instrument-panel aesthetic: deep charcoal, mono numerals, ring gauges, surgical accent. Whoop/Oura inspired.
**Probability: 0.06**

---

## CHOSEN APPROACH: "Kinetic Athlete" (refined toward premium dark sport-tech)

**Design Movement**: Modern Sport-Tech / Athletic Performance UI — the visual language of Apple Fitness+ rings and Nike's bold typographic energy, executed on a deep, premium dark canvas.

**Core Principles**:
1. Dark, focused canvas so vivid data and rings pop — reduces eye strain on a fitness companion used daily.
2. Big confident numerals — daily targets are the hero; numbers read like a scoreboard.
3. One electric accent (lime-green energy) used sparingly for progress, CTAs, and focus.
4. Step-by-step momentum — onboarding feels like a guided warm-up, each step a clean focused card with a progress bar.

**Color Philosophy**: A near-black charcoal base (`oklch(0.16 0.01 260)`) evokes a premium gym/night-run mood. The signature **electric lime** (`oklch(0.86 0.20 130)`) signals energy, GO, growth. A cool slate for secondary surfaces. Warm amber for water/streaks accents, soft cyan for water. Color carries meaning: lime = primary goal/CTA, cyan = water, amber = steps, rose = calories, violet = protein.

**Layout Paradigm**: Mobile-first single-column "app shell" centered in a phone-width frame on desktop. Onboarding = full-height focused step cards with a top progress indicator. Dashboard = stacked stat tiles + hero ring, not a generic grid — an asymmetric hero target ring above a 2x2 metric grid.

**Signature Elements**:
1. Progress ring gauges (SVG) for each daily target.
2. A persistent slim top progress bar during onboarding.
3. Pill-style large tappable option chips with lime active state and scale-press feedback.

**Interaction Philosophy**: Tap targets feel physical — `scale(0.97)` on press, smooth 200ms slide transitions between steps. Selecting an option gives instant lime confirmation. No friction, no dead-ends — always a Back/Next.

**Animation**: Step transitions slide+fade (220ms ease-out). Option chips animate selection. Rings animate fill on dashboard mount with staggered 60ms delays. Respect prefers-reduced-motion.

**Typography System**: Display/headlines — **Space Grotesk** (bold, geometric, athletic). Body/UI — **Inter Tight** for clean legibility. Numerals shown large and bold. Headline weights 600-700, body 400-500.

**Brand Essence**: "Your pocket fitness coach for Uzbekistan." Personality: energetic, supportive, precise.

**Brand Voice**: Motivating but never preachy. Bilingual. e.g. UZ: "Bugun harakatlanamiz" / RU: "Двигаемся сегодня". CTA: "Boshlash" / "Начать".

**Wordmark & Logo**: "FitLog" with a custom lime spark/pulse glyph — an abstract upward pulse/heartbeat-stroke forming an "F" tick.

**Signature Brand Color**: Electric lime `oklch(0.86 0.20 130)`.
