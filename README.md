[Ckmeans.1d.dp]: https://cran.r-project.org/web/packages/Ckmeans.1d.dp/index.html  "Ckmeans.1d.dp"
[FunChisq]: https://cran.r-project.org/web/packages/FunChisq/index.html  "FunChisq"
[Zhang and Song 2013]: http://arxiv.org/pdf/1311.2707v3.pdf  "Zhang and Song 2013"

# funchisq-wrapper [![Circle CI](https://circleci.com/gh/koksal/funchisq-wrapper.svg?style=svg)](https://circleci.com/gh/koksal/funchisq-wrapper)
Scala wrapper for running time series network inference using the Chi-Square test for functional dependency analysis, described in [Zhang and Song 2013]. This wrapper puts together two steps of the inference pipeline, using the original R implementations:
* First, data is discretized using [Ckmeans.1d.dp].
* Second, pairwise functional dependency analysis is performed using [FunChisq].
