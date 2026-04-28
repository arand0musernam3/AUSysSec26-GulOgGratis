package qr;

import cv.i;
import h0.g;
import ir.h;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f37242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f37243c;

    public /* synthetic */ e(h hVar, Function1 function1) {
        this.f37241a = 5;
        this.f37243c = hVar;
        this.f37242b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37241a) {
            case 0:
                this.f37242b.invoke(or.a.GENDER);
                this.f37243c.d(i.TEMP_SCREEN_ACCT_DETAILS_FIELD, g.E(new Pair(dv.a.SCREEN, new dv.c("gender"))));
                break;
            case 1:
                this.f37242b.invoke(or.a.DIETARY);
                this.f37243c.d(i.TEMP_SCREEN_ACCT_DETAILS_FIELD, g.E(new Pair(dv.a.SCREEN, new dv.c("food_preferences"))));
                break;
            case 2:
                this.f37242b.invoke(nr.a.HOME);
                this.f37243c.d(i.TEMP_SCREEN_ACCT_DETAILS_FIELD, g.E(new Pair(dv.a.SCREEN, new dv.c("poi_home"))));
                break;
            case 3:
                this.f37242b.invoke(nr.a.WORK);
                this.f37243c.d(i.TEMP_SCREEN_ACCT_DETAILS_FIELD, g.E(new Pair(dv.a.SCREEN, new dv.c("poi_work"))));
                break;
            case 4:
                this.f37242b.invoke(nr.a.OTHER);
                this.f37243c.d(i.TEMP_SCREEN_ACCT_DETAILS_FIELD, g.E(new Pair(dv.a.SCREEN, new dv.c("poi_other"))));
                break;
            default:
                this.f37243c.d(i.TEMP_SCREEN_ACCT_DETAILS_FIELD, g.E(new Pair(dv.a.SCREEN, new dv.c("collection_times"))));
                this.f37242b.invoke(or.a.COLLECTION_TIMES);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(Function1 function1, h hVar, int i11) {
        this.f37241a = i11;
        this.f37242b = function1;
        this.f37243c = hVar;
    }
}
