package o90;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.i1;
import kotlin.collections.p0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class o extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n90.b0 f32184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SerialDescriptor f32185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32187i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n90.c cVar, n90.b0 b0Var, String str, SerialDescriptor serialDescriptor) {
        super(str, cVar);
        cVar.getClass();
        b0Var.getClass();
        this.f32184f = b0Var;
        this.f32185g = serialDescriptor;
    }

    @Override // o90.a
    public n90.n E(String str) {
        str.getClass();
        return (n90.n) x0.c(str, S());
    }

    @Override // o90.a
    public String Q(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        n90.c cVar = this.f32151c;
        k.o(serialDescriptor, cVar);
        String strF = serialDescriptor.f(i11);
        if (this.f32153e.f30777g && !S().f30747a.keySet().contains(strF)) {
            h hVar = cVar.f30751c;
            m90.z zVar = new m90.z(19, serialDescriptor, cVar);
            hVar.getClass();
            ConcurrentHashMap concurrentHashMap = hVar.f32168a;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            l lVar = k.f32173a;
            Object objInvoke = map != null ? map.get(lVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = zVar.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(lVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            Iterator it = S().f30747a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i11) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // o90.a
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public n90.b0 S() {
        return this.f32184f;
    }

    @Override // o90.a, l90.a
    public void b(SerialDescriptor serialDescriptor) {
        Set setH;
        serialDescriptor.getClass();
        n90.c cVar = this.f32151c;
        if (k.l(serialDescriptor, cVar) || (serialDescriptor.getKind() instanceof k90.c)) {
            return;
        }
        k.o(serialDescriptor, cVar);
        if (this.f32153e.f30777g) {
            Set setB = c1.b(serialDescriptor);
            h hVar = cVar.f30751c;
            hVar.getClass();
            Map map = (Map) hVar.f32168a.get(serialDescriptor);
            Object obj = map != null ? map.get(k.f32173a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = p0.f26531a;
            }
            setH = i1.h(setB, setKeySet);
        } else {
            setH = c1.b(serialDescriptor);
        }
        for (String str : S().f30747a.keySet()) {
            if (!setH.contains(str) && !Intrinsics.areEqual(str, this.f32152d)) {
                StringBuilder sbS = e0.f.s("Encountered an unknown key '", str, "' at element: ");
                sbS.append(U());
                sbS.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbS.append((Object) k.n(-1, S().toString()));
                throw k.c(-1, sbS.toString());
            }
        }
    }

    @Override // o90.a, kotlinx.serialization.encoding.Decoder
    public final l90.a c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.f32185g;
        if (serialDescriptor != serialDescriptor2) {
            return super.c(serialDescriptor);
        }
        n90.n nVarF = F();
        String strA = serialDescriptor2.a();
        if (nVarF instanceof n90.b0) {
            return new o(this.f32151c, (n90.b0) nVarF, this.f32152d, serialDescriptor2);
        }
        throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(n90.b0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarF.getClass()).getSimpleName() + " as the serialized body of " + strA + " at element: " + U(), nVarF.toString());
    }

    @Override // o90.a, kotlinx.serialization.encoding.Decoder
    public final boolean v() {
        return !this.f32187i && super.v();
    }

    @Override // l90.a
    public int w(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        while (this.f32186h < serialDescriptor.e()) {
            int i11 = this.f32186h;
            this.f32186h = i11 + 1;
            String strR = R(serialDescriptor, i11);
            int i12 = this.f32186h - 1;
            this.f32187i = false;
            if (!S().containsKey(strR)) {
                boolean z11 = (this.f32151c.f30749a.f30774d || serialDescriptor.i(i12) || !serialDescriptor.h(i12).c()) ? false : true;
                this.f32187i = z11;
                if (z11) {
                }
            }
            this.f32153e.getClass();
            return i12;
        }
        return -1;
    }

    public /* synthetic */ o(n90.c cVar, n90.b0 b0Var, String str, int i11) {
        this(cVar, b0Var, (i11 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }
}
