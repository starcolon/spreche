package com.starcolon.satze

import com.starcolon.satze.Rule

class Satze(val tokens: Seq[Token]) {
  override def toString: String = ???
  def toFrage(frageWort: String): Frage = ???
}

class Frage(override val tokens: Seq[Token], val frageWort: String) extends Satze(tokens) {
  override def toString = ???
  def toSatze: Satze = ???
}

object Satze {
  def fromStringTokens(stringTokens: Seq[String])(implicit rule: Rule): Satze = ???
  def fromTokens(tokens: Seq[Token])(implicit rule: Rule): Satze = ???
  def verify(s: Satze)(implicit rule: Rule): Satze = s match {
    case f: Frage => ???
    case _ => ???
  }
}

object Frage {
  def neu()(implicit rule: Rule): Frage = ???
}
