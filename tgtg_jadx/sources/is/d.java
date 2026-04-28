package is;

import com.app.tgtg.model.remote.DailyReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.b1;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DailyReminder f24167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f24168k;
    public final /* synthetic */ String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f24169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f24170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f24171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f24172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f24173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f24174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b1 f24175s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DailyReminder dailyReminder, b1 b1Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f24167j = dailyReminder;
        this.f24168k = b1Var;
        this.l = str;
        this.f24169m = str2;
        this.f24170n = str3;
        this.f24171o = str4;
        this.f24172p = str5;
        this.f24173q = str6;
        this.f24174r = str7;
        this.f24175s = b1Var2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f24167j, this.f24168k, this.l, this.f24169m, this.f24170n, this.f24171o, this.f24172p, this.f24173q, this.f24174r, this.f24175s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        b1 b1Var = this.f24168k;
        DailyReminder dailyReminder = this.f24167j;
        b1Var.setValue(dailyReminder);
        this.f24175s.setValue(a.a.g(this.l, this.f24169m, this.f24170n, this.f24171o, this.f24172p, this.f24173q, this.f24174r, dailyReminder == null ? new DailyReminder(false, false, false, false, false, false, false, 127, (DefaultConstructorMarker) null) : dailyReminder));
        return Unit.f26487a;
    }
}
