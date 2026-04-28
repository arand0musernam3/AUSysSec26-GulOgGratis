package jt;

import android.app.Application;
import co.datadome.sdk.DataDomeInterceptor;
import co.datadome.sdk.DataDomeSDK;
import com.app.tgtg.model.local.AppConstants;
import ft.o;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import q90.c0;
import q90.d0;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f25397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f25398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mv.b f25400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f25401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f25402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f25403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f25404h;

    public f(Application application, o oVar, String str, mv.b bVar) {
        oVar.getClass();
        str.getClass();
        bVar.getClass();
        this.f25397a = application;
        this.f25398b = oVar;
        this.f25399c = str;
        this.f25400d = bVar;
        this.f25401e = new h(bVar, this);
        final int i11 = 0;
        this.f25402f = l.b(new Function0(this) { // from class: jt.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f25396b;

            {
                this.f25396b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return this.f25396b.a(c.DEFAULT);
                    case 1:
                        return this.f25396b.a(c.TOKEN);
                    default:
                        return this.f25396b.a(c.PUBLIC);
                }
            }
        });
        final int i12 = 1;
        this.f25403g = l.b(new Function0(this) { // from class: jt.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f25396b;

            {
                this.f25396b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f25396b.a(c.DEFAULT);
                    case 1:
                        return this.f25396b.a(c.TOKEN);
                    default:
                        return this.f25396b.a(c.PUBLIC);
                }
            }
        });
        final int i13 = 2;
        this.f25404h = l.b(new Function0(this) { // from class: jt.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f25396b;

            {
                this.f25396b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f25396b.a(c.DEFAULT);
                    case 1:
                        return this.f25396b.a(c.TOKEN);
                    default:
                        return this.f25396b.a(c.PUBLIC);
                }
            }
        });
    }

    public final d0 a(c cVar) {
        c0 c0Var = new c0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        c0Var.f36450y = r90.g.b(30L, timeUnit);
        c0Var.A = r90.g.b(30L, timeUnit);
        c0Var.f36451z = r90.g.b(30L, timeUnit);
        c0Var.f36432f = true;
        c0Var.f36433g = true;
        String datadomSdkkey = AppConstants.INSTANCE.getDatadomSdkkey();
        Application application = this.f25397a;
        DataDomeInterceptor dataDomeInterceptor = new DataDomeInterceptor(application, DataDomeSDK.with(application, datadomSdkkey, "26.4.1"));
        ArrayList arrayList = c0Var.f36429c;
        arrayList.add(dataDomeInterceptor);
        c cVar2 = c.PUBLIC;
        o oVar = this.f25398b;
        if (cVar != cVar2) {
            arrayList.add(new nt.b(oVar, this.f25399c, this.f25400d));
        }
        if (cVar == c.DEFAULT) {
            h hVar = this.f25401e;
            arrayList.add(new nt.a(hVar, oVar));
            c0Var.f36434h = new k8.d(hVar, oVar);
        }
        return new d0(c0Var);
    }

    public final d0 b(c cVar) {
        cVar.getClass();
        int i11 = e.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i11 == 1) {
            return (d0) this.f25402f.getValue();
        }
        if (i11 == 2) {
            return (d0) this.f25403g.getValue();
        }
        if (i11 == 3) {
            return (d0) this.f25404h.getValue();
        }
        e40.a.f();
        return null;
    }
}
