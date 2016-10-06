[Ckmeans.1d.dp]: https://cran.r-project.org/web/packages/Ckmeans.1d.dp/index.html  "Ckmeans.1d.dp"
[FunChisq]: https://cran.r-project.org/web/packages/FunChisq/index.html  "FunChisq"
[Zhang and Song 2013]: http://arxiv.org/pdf/1311.2707v3.pdf  "Zhang and Song 2013"
[sbt]: https://github.com/sbt/sbt

# funchisq-wrapper [![Circle CI](https://circleci.com/gh/koksal/funchisq-wrapper.svg?style=svg)](https://circleci.com/gh/koksal/funchisq-wrapper)
Scala wrapper for running time series network inference using the Chi-Square test for functional dependency analysis, described in [Zhang and Song 2013]. This wrapper provides an end-to-end inference pipeline, using the original R implementations:
* First, data is discretized using [Ckmeans.1d.dp].
* Then, discretized data is transformed into contingency tables.
* Finally, pairwise functional dependency analysis is performed on the contingency tables using [FunChisq].

## Dependencies
* [sbt]
* R
* [Ckmeans.1d.dp] and [FunChisq] R packages

## Usage
Use sbt to run the program with a tab-separated time series file as an input argument:

        sbt "run <file>"
