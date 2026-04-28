package a3;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t5.c f266d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextClassifier f268f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e90.c f267e = e90.d.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.k1 f269g = m3.i.w(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f270h = new Object();

    public b0(CoroutineContext coroutineContext, Context context, g0 g0Var, t5.c cVar) {
        this.f263a = coroutineContext;
        this.f264b = context;
        this.f265c = g0Var;
        this.f266d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(a3.b0 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, z70.c r21) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b0.a(a3.b0, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, z70.c):java.lang.Object");
    }

    public final void b(o2.a aVar, CharSequence charSequence, long j9, Function1 function1) {
        e90.c cVar = this.f267e;
        TextClassification textClassification = null;
        if (cVar.tryLock()) {
            y2 y2Var = (y2) this.f269g.getValue();
            TextClassification textClassification2 = (y2Var != null && m5.t0.c(j9, y2Var.f638b) && Intrinsics.areEqual(charSequence, y2Var.f637a)) ? y2Var.f639c : null;
            cVar.e(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            function1.invoke(aVar);
            return;
        }
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.f270h;
        if (!zIsEmpty) {
            aVar.f31809a.g(new p2.h(obj, textClassification, 0));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            aVar.f31809a.g(new p2.h(obj, textClassification, -1));
        }
        function1.invoke(aVar);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i11 = 0; i11 < size; i11++) {
            actions.get(i11);
            if (i11 > 0) {
                aVar.f31809a.g(new p2.h(obj, textClassification, i11));
            }
        }
    }

    public final LocaleList c() {
        t5.c cVar = this.f266d;
        if (cVar == null) {
            return new LocaleList(t5.d.f39798a.k().b().f39794a);
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(cVar, 10));
        Iterator it = cVar.f39796a.iterator();
        while (it.hasNext()) {
            arrayList.add(((t5.b) it.next()).f39794a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object d(CharSequence charSequence, long j9, z70.i iVar) {
        if (charSequence.length() == 0 || m5.t0.d(j9)) {
            return Unit.f26487a;
        }
        return v80.f0.K(this.f263a, new z(this, new w(this, charSequence, j9, (x70.c) null, 0), null), iVar);
    }

    public final Object e(CharSequence charSequence, long j9, z70.i iVar) {
        if (charSequence.length() == 0 || m5.t0.d(j9)) {
            return null;
        }
        return v80.f0.K(this.f263a, new z(this, new a0(charSequence, j9, this, null), null), iVar);
    }
}
