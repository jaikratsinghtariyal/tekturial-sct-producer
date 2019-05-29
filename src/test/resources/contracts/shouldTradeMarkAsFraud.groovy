package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/fraudcheck?loanAmount=99999'
    }
    response {
        status 200
        body("""{
    "fraudCheckStatus": "FRAUD",
    "rejectionReason": "Amount too high"
  }""")
        headers {
            header('Content-Type': 'text/plain;charset=ISO-8859-1')
        }
    }
}