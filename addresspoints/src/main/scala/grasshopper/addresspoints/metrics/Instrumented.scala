package grasshopper.addresspoints.metrics

import nl.grons.metrics.scala.InstrumentedBuilder

trait Instrumented extends InstrumentedBuilder {
  val metricRegistry = Registry.metricsRegistry
}
