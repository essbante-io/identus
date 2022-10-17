package io.iohk.atala.castor.core.model.did

// EC Name is used in JWK https://w3c-ccg.github.io/security-vocab/#publicKeyJwk
// It MUST match the curve name in https://www.iana.org/assignments/jose/jose.xhtml
// in the "JSON Web Key Elliptic Curve" section
enum EllipticCurve(val name: String) {
  case SECP256K1 extends EllipticCurve("secp256k1")
}

object EllipticCurve {

  private val lookup = EllipticCurve.values.map(i => i.name -> i).toMap

  def parseString(s: String): Option[EllipticCurve] = lookup.get(s)

}