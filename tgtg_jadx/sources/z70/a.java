package z70;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p.o2;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements x70.c, d, Serializable {

    @Nullable
    private final x70.c<Object> completion;

    public a(x70.c cVar) {
        this.completion = cVar;
    }

    @NotNull
    public x70.c<Unit> create(@NotNull x70.c<?> cVar) {
        cVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // z70.d
    @Nullable
    public d getCallerFrame() {
        x70.c<Object> cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Nullable
    public final x70.c<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i11 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f.f47347a.getClass();
        o2 o2Var = f.f47349c;
        o2 o2Var2 = f.f47348b;
        if (o2Var == null) {
            try {
                o2 o2Var3 = new o2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f47349c = o2Var3;
                o2Var = o2Var3;
            } catch (Exception unused2) {
                f.f47349c = o2Var2;
                o2Var = o2Var2;
            }
        }
        if (o2Var != o2Var2 && (method = o2Var.f33962a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = o2Var.f33963b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = o2Var.f33964c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i11);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // x70.c
    public final void resumeWith(@NotNull Object obj) {
        x70.c<Object> cVar = this;
        while (true) {
            a aVar = (a) cVar;
            x70.c<Object> cVar2 = aVar.completion;
            cVar2.getClass();
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                o oVar = q.f40850b;
                obj = new p(th2);
            }
            if (obj == y70.a.COROUTINE_SUSPENDED) {
                return;
            }
            o oVar2 = q.f40850b;
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
        cVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
