package app.cash.paykit.core.models.analytics;

import a60.b0;
import a60.k;
import a60.n;
import a60.p;
import a60.q;
import b60.f;
import c50.w;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.collections.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: app.cash.paykit.core.models.analytics.EventStream2EventJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/cash/paykit/core/models/analytics/EventStream2EventJsonAdapter;", "La60/k;", "Lapp/cash/paykit/core/models/analytics/EventStream2Event;", "La60/b0;", "moshi", "<init>", "(La60/b0;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GeneratedJsonAdapter extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f4594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f4595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f4596c;

    public GeneratedJsonAdapter(@NotNull b0 b0Var) {
        b0Var.getClass();
        this.f4594a = n.a("app_name", "catalog_name", "json_data", "recorded_at_usec", "uuid");
        p0 p0Var = p0.f26531a;
        this.f4595b = b0Var.a(String.class, p0Var, "appName");
        this.f4596c = b0Var.a(Long.TYPE, p0Var, "recordedAt");
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        pVar.getClass();
        pVar.e();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            Long l7 = l;
            if (!pVar.G()) {
                String str5 = str;
                pVar.t();
                if (str5 == null) {
                    throw f.e("appName", "app_name", pVar);
                }
                if (str2 == null) {
                    throw f.e("catalogName", "catalog_name", pVar);
                }
                if (str3 == null) {
                    throw f.e("jsonData", "json_data", pVar);
                }
                if (l7 == null) {
                    throw f.e("recordedAt", "recorded_at_usec", pVar);
                }
                long jLongValue = l7.longValue();
                if (str4 != null) {
                    return new EventStream2Event(str5, str2, str3, jLongValue, str4);
                }
                throw f.e("uuid", "uuid", pVar);
            }
            int iY0 = pVar.y0(this.f4594a);
            String str6 = str;
            if (iY0 != -1) {
                k kVar = this.f4595b;
                if (iY0 == 0) {
                    str = (String) kVar.a(pVar);
                    if (str == null) {
                        throw f.j("appName", "app_name", pVar);
                    }
                    l = l7;
                } else if (iY0 == 1) {
                    str2 = (String) kVar.a(pVar);
                    if (str2 == null) {
                        throw f.j("catalogName", "catalog_name", pVar);
                    }
                } else if (iY0 == 2) {
                    str3 = (String) kVar.a(pVar);
                    if (str3 == null) {
                        throw f.j("jsonData", "json_data", pVar);
                    }
                } else if (iY0 == 3) {
                    l = (Long) this.f4596c.a(pVar);
                    if (l == null) {
                        throw f.j("recordedAt", "recorded_at_usec", pVar);
                    }
                    str = str6;
                } else if (iY0 == 4 && (str4 = (String) kVar.a(pVar)) == null) {
                    throw f.j("uuid", "uuid", pVar);
                }
            } else {
                pVar.z0();
                pVar.B0();
            }
            l = l7;
            str = str6;
        }
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        EventStream2Event eventStream2Event = (EventStream2Event) obj;
        qVar.getClass();
        if (eventStream2Event == null) {
            w.l("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        qVar.g();
        qVar.u("app_name");
        String str = eventStream2Event.f4589a;
        k kVar = this.f4595b;
        kVar.e(qVar, str);
        qVar.u("catalog_name");
        kVar.e(qVar, eventStream2Event.f4590b);
        qVar.u("json_data");
        kVar.e(qVar, eventStream2Event.f4591c);
        qVar.u("recorded_at_usec");
        this.f4596c.e(qVar, Long.valueOf(eventStream2Event.f4592d));
        qVar.u("uuid");
        kVar.e(qVar, eventStream2Event.f4593e);
        qVar.r();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("GeneratedJsonAdapter(EventStream2Event)");
        return sb2.toString();
    }
}
