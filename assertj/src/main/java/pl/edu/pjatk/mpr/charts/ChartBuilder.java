package pl.edu.pjatk.mpr.charts;

import pl.edu.pjatk.mpr.charts.domain.ChartSerie;
import pl.edu.pjatk.mpr.charts.domain.ChartSettings;
import pl.edu.pjatk.mpr.charts.domain.ChartType;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Krzysztof on 09/01/16.
 */
public class ChartBuilder {
    private ChartSettings chartSettings;

    public ChartBuilder() {
        chartSettings = new ChartSettings();
    }

    public ChartBuilder addSerie(ChartSerie chartSerie) {
        List<ChartSerie> series = chartSettings.getSeries();
        if (series == null) {
            series = new LinkedList<ChartSerie>();
            chartSettings.setSeries(series);
        }
        series.add(chartSerie);
        return this;
    }

    public ChartBuilder withSeries(List<ChartSerie> series) {
        chartSettings.setSeries(series);
        return this;
    }

    public ChartBuilder withTitle(String title) {
        chartSettings.setTitle(title);
        return this;
    }

    public ChartBuilder withLegend() {
        chartSettings.setHasLegend(true);
        return this;
    }

    public ChartBuilder withType(ChartType type) {
        chartSettings.setChartType(type);
        return this;
    }

    private ChartSettings build() {
        return chartSettings;
    }
}
