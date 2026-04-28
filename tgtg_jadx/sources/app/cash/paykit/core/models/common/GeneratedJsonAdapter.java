package app.cash.paykit.core.models.common;

import a60.b0;
import a60.k;
import a60.n;
import a60.p;
import a60.q;
import b60.f;
import c50.w;
import com.squareup.moshi.JsonEncodingException;
import fc.a;
import java.io.EOFException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: app.cash.paykit.core.models.common.ActionJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/cash/paykit/core/models/common/ActionJsonAdapter;", "La60/k;", "Lapp/cash/paykit/core/models/common/Action;", "La60/b0;", "moshi", "<init>", "(La60/b0;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GeneratedJsonAdapter extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f4642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f4643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f4644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f4645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f4646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Constructor f4647f;

    public GeneratedJsonAdapter(@NotNull b0 b0Var) {
        b0Var.getClass();
        this.f4642a = n.a("amount", "currency", "scope_id", "type", "account_reference_id");
        p0 p0Var = p0.f26531a;
        this.f4643b = b0Var.a(Integer.class, p0Var, "amount_cents");
        this.f4644c = b0Var.a(String.class, p0Var, "currency");
        this.f4645d = b0Var.a(String.class, p0Var, "scopeId");
        this.f4646e = b0Var.a(a.class, p0Var, "accountReferenceId");
    }

    @Override // a60.k
    public final Object a(p pVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, EOFException, JsonEncodingException, InvocationTargetException {
        pVar.getClass();
        pVar.e();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        a aVar = null;
        int i11 = -1;
        while (pVar.G()) {
            int iY0 = pVar.y0(this.f4642a);
            if (iY0 == -1) {
                pVar.z0();
                pVar.B0();
            } else if (iY0 == 0) {
                num = (Integer) this.f4643b.a(pVar);
                i11 &= -2;
            } else if (iY0 == 1) {
                str = (String) this.f4644c.a(pVar);
                i11 &= -3;
            } else if (iY0 == 2) {
                str2 = (String) this.f4645d.a(pVar);
                if (str2 == null) {
                    throw f.j("scopeId", "scope_id", pVar);
                }
            } else if (iY0 == 3) {
                str3 = (String) this.f4645d.a(pVar);
                if (str3 == null) {
                    throw f.j("type", "type", pVar);
                }
            } else if (iY0 == 4) {
                aVar = (a) this.f4646e.a(pVar);
                i11 &= -17;
            }
        }
        pVar.t();
        if (i11 == -20) {
            a aVar2 = aVar;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            Integer num2 = num;
            if (str5 == null) {
                throw f.e("scopeId", "scope_id", pVar);
            }
            if (str4 != null) {
                return new Action(num2, str6, str5, str4, aVar2);
            }
            throw f.e("type", "type", pVar);
        }
        a aVar3 = aVar;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Integer num3 = num;
        Constructor declaredConstructor = this.f4647f;
        if (declaredConstructor == null) {
            declaredConstructor = Action.class.getDeclaredConstructor(Integer.class, String.class, String.class, String.class, a.class, Integer.TYPE, f.f6051c);
            this.f4647f = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (str8 == null) {
            throw f.e("scopeId", "scope_id", pVar);
        }
        if (str7 == null) {
            throw f.e("type", "type", pVar);
        }
        Object objNewInstance = declaredConstructor.newInstance(num3, str9, str8, str7, aVar3, Integer.valueOf(i11), null);
        objNewInstance.getClass();
        return (Action) objNewInstance;
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        Action action = (Action) obj;
        qVar.getClass();
        if (action == null) {
            w.l("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        qVar.g();
        qVar.u("amount");
        this.f4643b.e(qVar, action.f4637a);
        qVar.u("currency");
        this.f4644c.e(qVar, action.f4638b);
        qVar.u("scope_id");
        String str = action.f4639c;
        k kVar = this.f4645d;
        kVar.e(qVar, str);
        qVar.u("type");
        kVar.e(qVar, action.f4640d);
        qVar.u("account_reference_id");
        this.f4646e.e(qVar, action.f4641e);
        qVar.r();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("GeneratedJsonAdapter(Action)");
        return sb2.toString();
    }
}
