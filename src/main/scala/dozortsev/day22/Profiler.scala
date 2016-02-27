package dozortsev.day22

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.{Around, Pointcut, Aspect}

@Aspect
object Profiler {

  @Pointcut("execution(* dozortsev.day22.*.*(..))")
  def businessMethods(): Unit = {

  }

  @Around("businessMethods()")
  def profile(pjp: ProceedingJoinPoint): AnyRef = {
    val start = System.currentTimeMillis()
    println("Going to call the method.")
    val proceed: AnyRef = pjp.proceed()
    println("Method execution completed.")
    val elapsedTime = System.currentTimeMillis() - start
    System.out.println("Method execution time: " + elapsedTime + " milliseconds.")

    proceed
  }
}
