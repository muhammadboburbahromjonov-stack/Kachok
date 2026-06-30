import React from 'react';
import { useTranslation } from '@/contexts/LanguageContext';

export const PageVazn: React.FC = () => {
  const t = useTranslation();

  const currentWeight = 125;
  const goalWeight = 118;
  const startWeight = 130;

  const weightHistory = [
    { date: '2026-06-15', weight: 125 },
    { date: '2026-06-14', weight: 125.2 },
    { date: '2026-06-13', weight: 125.5 },
    { date: '2026-06-12', weight: 125.8 },
    { date: '2026-06-11', weight: 126 },
  ];

  const progress = ((startWeight - currentWeight) / (startWeight - goalWeight)) * 100;

  return (
    <div className="content-area">
      {/* Header */}
      <div className="mb-4">
        <h1>Vazn</h1>
        <p className="text-sm mt-1">Maqsadga {goalWeight - currentWeight}kg qoldi</p>
      </div>

      {/* Weight Stats */}
      <div className="hero-card mb-4 animate-slide-up">
        <div className="grid-3 gap-4 mb-4">
          <div>
            <p className="metric-label">Hozirgi</p>
            <p className="metric-value">{currentWeight}</p>
            <p className="metric-unit">kg</p>
          </div>
          <div>
            <p className="metric-label">Maqsad</p>
            <p className="metric-value text-accent-success">{goalWeight}</p>
            <p className="metric-unit">kg</p>
          </div>
          <div>
            <p className="metric-label">O'zgarish</p>
            <p className="metric-value text-accent-primary">{startWeight - currentWeight}</p>
            <p className="metric-unit">kg</p>
          </div>
        </div>

        <div className="space-y-2 pt-4 border-t border-black/6">
          <div className="flex items-center justify-between">
            <span className="text-sm font-600">Taraqqiyot</span>
            <span className="text-lg font-700">{Math.round(progress)}%</span>
          </div>
          <div className="w-full h-3 bg-black/8 rounded-full overflow-hidden">
            <div
              className="h-full bg-gradient-to-r from-accent-primary to-accent-warning rounded-full transition-all duration-700"
              style={{ width: `${progress}%` }}
            />
          </div>
        </div>
      </div>

      {/* Weight History */}
      <div className="section">
        <h2 className="section-title">Oxirgi O'zgarishlar</h2>
        <div className="space-y-2">
          {weightHistory.map((entry, idx) => (
            <div key={entry.date} className="card-solid flex items-center justify-between">
              <div>
                <p className="text-sm font-600">{new Date(entry.date).toLocaleDateString('uz-UZ', { weekday: 'short' })}</p>
                <p className="text-xs text-text-secondary">{new Date(entry.date).toLocaleDateString()}</p>
              </div>
              <div className="text-right">
                <p className="text-lg font-700">{entry.weight}kg</p>
                {idx > 0 && (
                  <p className={`text-xs ${entry.weight < weightHistory[idx - 1].weight ? 'text-accent-success' : 'text-accent-primary'}`}>
                    {entry.weight < weightHistory[idx - 1].weight ? '↓' : '↑'} {Math.abs(entry.weight - weightHistory[idx - 1].weight).toFixed(1)}kg
                  </p>
                )}
              </div>
            </div>
          ))}
        </div>
      </div>

      {/* Projection */}
      <div className="card-solid">
        <p className="metric-label mb-2">Prognoza</p>
        <p className="text-lg font-600 mb-1">Taxminan 45 kundan keyin</p>
        <p className="text-sm text-text-secondary">Hozirgi tezlik asosida maqsadga yetasiz</p>
      </div>
    </div>
  );
};
