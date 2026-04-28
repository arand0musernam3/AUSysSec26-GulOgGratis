package g9;

import com.braze.h2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.w0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f20108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f20110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f20111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u0 u0Var, Object obj, KClass kClass, Map map) {
        super(u0Var.b(zz.f.t(e0.class)), kClass, map);
        u0Var.getClass();
        obj.getClass();
        map.getClass();
        this.f20111j = new ArrayList();
        this.f20108g = u0Var;
        this.f20110i = obj;
    }

    public final b0 i() {
        b0 b0Var = (b0) super.a();
        ArrayList<z> arrayList = this.f20111j;
        arrayList.getClass();
        i0.w wVar = b0Var.f20106g;
        wVar.getClass();
        for (z zVar : arrayList) {
            if (zVar != null) {
                wVar.d(zVar);
            }
        }
        Object obj = this.f20110i;
        String str = this.f20109h;
        if (str == null && obj == null) {
            if (this.f20097a != null) {
                h2.b("You must set a start destination route");
                return null;
            }
            h2.b("You must set a start destination id");
            return null;
        }
        if (str != null) {
            wVar.N(str);
            return b0Var;
        }
        if (obj == null) {
            b0Var.p(0);
            return b0Var;
        }
        KSerializer kSerializerI = ba0.g.I(Reflection.getOrCreateKotlinClass(obj.getClass()));
        int iB = m9.d.b(kSerializerI);
        z zVarU = wVar.u(iB);
        if (zVarU == null) {
            qc.y.j("Cannot find startDestination ", kSerializerI.getDescriptor().a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            return null;
        }
        Map mapH = zVarU.h();
        LinkedHashMap linkedHashMap = new LinkedHashMap(w0.a(mapH.size()));
        for (Map.Entry entry : mapH.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((j) entry.getValue()).f20149a);
        }
        wVar.N(m9.d.d(obj, linkedHashMap));
        wVar.f22745b = iB;
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u0 u0Var, String str, String str2) {
        super(u0Var.b(zz.f.t(e0.class)), -1, str2);
        u0Var.getClass();
        str.getClass();
        this.f20111j = new ArrayList();
        this.f20108g = u0Var;
        this.f20109h = str;
    }
}
