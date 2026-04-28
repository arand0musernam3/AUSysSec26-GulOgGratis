package go;

import com.app.tgtg.model.remote.order.Order;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Order f20698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f20700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f20701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f20702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1 f20703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f20704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20705h;

    public a(Order order, long j9, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, Function0 function0, boolean z11) {
        b1Var.getClass();
        b1Var3.getClass();
        b1Var4.getClass();
        this.f20698a = order;
        this.f20699b = j9;
        this.f20700c = b1Var;
        this.f20701d = b1Var2;
        this.f20702e = b1Var3;
        this.f20703f = b1Var4;
        this.f20704g = function0;
        this.f20705h = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f20698a, aVar.f20698a) && this.f20699b == aVar.f20699b && Intrinsics.areEqual(this.f20700c, aVar.f20700c) && Intrinsics.areEqual(this.f20701d, aVar.f20701d) && Intrinsics.areEqual(this.f20702e, aVar.f20702e) && Intrinsics.areEqual(this.f20703f, aVar.f20703f) && Intrinsics.areEqual(this.f20704g, aVar.f20704g) && this.f20705h == aVar.f20705h;
    }

    public final int hashCode() {
        int iHashCode = (this.f20703f.hashCode() + ((this.f20702e.hashCode() + ((this.f20701d.hashCode() + ((this.f20700c.hashCode() + e0.f.b(this.f20698a.hashCode() * 31, 31, this.f20699b)) * 31)) * 31)) * 31)) * 31;
        Function0 function0 = this.f20704g;
        return Boolean.hashCode(this.f20705h) + ((iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31);
    }

    public final String toString() {
        return "CharityMainViewState(order=" + this.f20698a + ", counter=" + this.f20699b + ", isCollectBtnVisible=" + this.f20700c + ", showCancelPopup=" + this.f20701d + ", openRemindMeToCollectBottomSheet=" + this.f20702e + ", collectionReminderCoordinates=" + this.f20703f + ", onAllergensUrlClicked=" + this.f20704g + ", isPurchaseBtnEnabled=" + this.f20705h + ")";
    }
}
