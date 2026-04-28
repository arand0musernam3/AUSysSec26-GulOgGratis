package xy;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub.a f44510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5.a f44511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f44512c;

    public f(Context context, t5.a aVar) {
        ub.a aVar2 = new ub.a((Object) context, 21, (byte) 0);
        this.f44512c = new HashMap();
        this.f44510a = aVar2;
        this.f44511b = aVar;
    }

    public final synchronized g a(String str) {
        if (this.f44512c.containsKey(str)) {
            return (g) this.f44512c.get(str);
        }
        CctBackendFactory cctBackendFactoryS = this.f44510a.s(str);
        if (cctBackendFactoryS == null) {
            return null;
        }
        t5.a aVar = this.f44511b;
        g gVarCreate = cctBackendFactoryS.create(new b((Context) aVar.f39791b, (fz.a) aVar.f39792c, (fz.a) aVar.f39793d, str));
        this.f44512c.put(str, gVarCreate);
        return gVarCreate;
    }
}
