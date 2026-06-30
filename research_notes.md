# FitLog — Mashhur fitness ilovalari tahlili (ilhom uchun)

## Tahlil qilingan ilovalar
MyFitnessPal, Apple Fitness+, Nike Training Club, Strava, Noom, Lifesum, Lose It!, Cronometer, Yazio, Fitbit, Calm/Headspace (onboarding ohangi uchun).

## Onboarding bo'yicha asosiy xulosalar (UXCam + amaliyot)
1. **Savollar → shaxsiy natija (MyFitnessPal pattern):** maqsad, vazn, faollik so'raladi va DARHOL shaxsiy kaloriya maqsadi hisoblanadi. Foydalanuvchi 5-6 savolga javob beradi, agar natija aniq shaxsiylashtirilgan bo'lsa. → FitLog'da Step 9 (avtomatik hisoblash) shu pattern.
2. **Progressive disclosure + ko'rinadigan progress (LinkedIn/Strava):** bitta katta forma emas, har bir qadam alohida, yuqorida progress bar. → 10 ta qadam ketma-ket, progress indikatori.
3. **Qiymatdan oldin minimal friksiya (Tinder/Duolingo):** faqat kerakli ma'lumot. → ortiqcha savol yo'q, akkaunt talab qilinmaydi (localStorage).
4. **Onboarding = mahsulot va'dasining kichik nusxasi (Headspace):** ohang mahsulotga mos. → FitLog energetik, motivatsion, sport-tech ohang.
5. **Bo'sh holat to'ldirilgandek (Notion):** onboarding tugagach dashboard allaqachon to'ldirilgan (maqsadlar bilan).

## Hisoblash formulalari (ilovalarda ishlatiladigan standart)
- **BMR — Mifflin-St Jeor (eng aniq, MyFitnessPal/Cronometer):**
  - Erkak: BMR = 10*kg + 6.25*sm − 5*yosh + 5
  - Ayol: BMR = 10*kg + 6.25*sm − 5*yosh − 161
- **TDEE = BMR × faollik koeffitsienti:**
  - Ko'p o'tiradi (sedentary): 1.2
  - Yengil faollik: 1.375
  - O'rtacha faollik: 1.55
  - Faol: 1.725
  - Juda faol: 1.9
- **Kunlik kaloriya (maqsadga ko'ra):**
  - Vazn yo'qotish: TDEE − 500 (≈ haftada 0.5 kg)
  - Vaznni saqlash: TDEE
  - Mushak yig'ish: TDEE + 300..350
  - Sog'liqni yaxshilash: TDEE (saqlash)
- **Oqsil (protein) g/kg (Examine.com):**
  - Vazn yo'qotish (deficit): 1.8–2.0 g/kg → 1.8 ishlatamiz (mushakni saqlash)
  - Saqlash / sog'liq: 1.4 g/kg
  - Mushak yig'ish: 1.8–2.2 g/kg → 2.0 ishlatamiz
  - Hisob: protein_g = vazn(kg) × koeff (joriy vazn asosida)
- **Suv (ml):** vazn(kg) × 35 ml standart. Faollik yuqori bo'lsa biroz +. Bazaviy: 35 ml/kg, sport kunlari +350-500 ml. FitLog: ml = kg × 35, yaxlitlanadi 50 ml gacha.
- **Qadamlar:** standart default 8000. Faollikka qarab taklif: sedentary 6000, light 8000, moderate 9000, active 10000, very active 12000. Foydalanuvchi tahrirlashi mumkin (default 8000).

## Dizayn ilhom (image references)
- Dark sport-tech dashboard, ring/halqa gauge'lar (Apple Fitness style) — index 5, 6 (dark, lime/teal accent).
- Katta raqamlar (scoreboard) — index 3 (MyFitnessPal calories/macros).
- Onboarding qadamlar pill/chip tanlovlar, progress — index 7, 8.
- Lime/green energy accent dark fonda — index 1, 5, 6.
→ Bizning "Kinetic Athlete" yo'nalishi (dark + electric lime + ring gauges + katta raqamlar) shu referenslarga to'liq mos.

## FitLog uchun yakuniy qaror
- 10 qadamli onboarding (foydalanuvchi spetsifikatsiyasi bo'yicha).
- Mifflin-St Jeor + TDEE + maqsad korreksiyasi bilan avtomatik hisoblash.
- Bilingual UZ (default) / RU, translation keys.
- localStorage'da saqlash, faqat birinchi ishga tushirishda onboarding.
- Settings'da hammasini tahrirlash + qayta hisoblash.
