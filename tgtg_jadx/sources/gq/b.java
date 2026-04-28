package gq;

import androidx.lifecycle.l1;
import ao.g3;
import com.app.tgtg.model.remote.RewardSurveyInfo;
import cv.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgq/b;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRewardNotRedeemedSurveyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewardNotRedeemedSurveyViewModel.kt\ncom/app/tgtg/feature/survey/rewards/RewardNotRedeemedSurveyViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1#2:87\n1#2:96\n1834#3,4:88\n1606#3:92\n1617#3:93\n1924#3,2:94\n1926#3:97\n1618#3:98\n*S KotlinDebug\n*F\n+ 1 RewardNotRedeemedSurveyViewModel.kt\ncom/app/tgtg/feature/survey/rewards/RewardNotRedeemedSurveyViewModel\n*L\n59#1:96\n42#1:88,4\n59#1:92\n59#1:93\n59#1:94,2\n59#1:97\n59#1:98\n*E\n"})
public final class b extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv.b f20787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardSurveyInfo f20788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f20790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f20791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f20792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f20793g;

    public b(g3 g3Var, cv.b bVar) {
        bVar.getClass();
        g3Var.getClass();
        this.f20787a = bVar;
        this.f20788b = g3Var.n().getRewardSurveyInfo();
        this.f20789c = 7;
        ArrayList arrayList = new ArrayList(7);
        for (int i11 = 0; i11 < 7; i11++) {
            arrayList.add(Boolean.FALSE);
        }
        a2 a2VarC = r.c(arrayList);
        this.f20790d = a2VarC;
        this.f20791e = new h1(a2VarC);
        a2 a2VarC2 = r.c("");
        this.f20792f = a2VarC2;
        this.f20793g = a2VarC2;
        this.f20787a.b(i.SCREEN_REWARDS_NOT_REDEEMED_SURVEY);
    }
}
