package contracts

[
org.springframework.cloud.contract.spec.Contract.make {
    name("Fraud Test")
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
},

org.springframework.cloud.contract.spec.Contract.make {
    name("Non-Fraud Test")
    request {
        method 'GET'
        url '/fraudcheck?loanAmount=9999'
    }
    response {
        status 200
        body("""{
    "fraudCheckStatus": "Not-Fraud",
    "rejectionReason": "Amount OK"
  }""")
        headers {
            header('Content-Type': 'text/plain;charset=ISO-8859-1')
        }
    }
}
]
