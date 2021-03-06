package io.codearte.accurest.wiremock

import groovy.transform.CompileStatic
import io.codearte.accurest.dsl.WiremockStubStrategy

@CompileStatic
class DslToWiremockClientConverter extends DslToWiremockConverter {

	@Override
	String convertContent(String dslBody) {
		return new WiremockStubStrategy(createGroovyDSLfromStringContent(dslBody)).toWiremockClientStub()
	}
}
