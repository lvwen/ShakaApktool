package com.rover12421.shaka.smali.dexlib2;

import com.rover12421.shaka.lib.reflect.Reflect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jf.dexlib2.dexbacked.DexBackedMethod;
import org.jf.dexlib2.dexbacked.DexBackedMethodImplementation;

/**
 * Created by rover12421 on 11/10/15.
 */
@Aspect
public class DexBackedMethodAj {
    private int getCodeOffset(DexBackedMethod dexBackedMethod) {
        return Reflect.on(dexBackedMethod).get("codeOffset");
    }

    @Around("execution(* org.jf.dexlib2.dexbacked.DexBackedMethod.getImplementation())")
    public DexBackedMethodImplementation getImplementation(ProceedingJoinPoint joinPoint) {
        DexBackedMethod thiz = (DexBackedMethod) joinPoint.getThis();
        int codeOffset = getCodeOffset(thiz);
        if (codeOffset != 0) {
            return new DexBackedMethodImplementation(thiz.dexFile, thiz, codeOffset);
        }
        return null;
    }
}
