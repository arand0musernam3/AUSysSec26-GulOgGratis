package app.cash.paykit.core.models.request;

import a60.i;
import a60.l;
import app.cash.paykit.core.models.common.Action;
import fc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lapp/cash/paykit/core/models/request/CustomerRequestData;", "", "", "Lapp/cash/paykit/core/models/common/Action;", "actions", "", "channel", "Lfc/a;", "redirectUri", "referenceId", "<init>", "(Ljava/util/List;Ljava/lang/String;Lfc/a;Lfc/a;)V", "copy", "(Ljava/util/List;Ljava/lang/String;Lfc/a;Lfc/a;)Lapp/cash/paykit/core/models/request/CustomerRequestData;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomerRequestData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f4657d;

    public CustomerRequestData(@i(name = "actions") @NotNull List<Action> list, @i(name = "channel") @Nullable String str, @i(name = "redirect_url") @Nullable a aVar, @i(name = "reference_id") @Nullable a aVar2) {
        list.getClass();
        this.f4654a = list;
        this.f4655b = str;
        this.f4656c = aVar;
        this.f4657d = aVar2;
    }

    @NotNull
    public final CustomerRequestData copy(@i(name = "actions") @NotNull List<Action> actions, @i(name = "channel") @Nullable String channel, @i(name = "redirect_url") @Nullable a redirectUri, @i(name = "reference_id") @Nullable a referenceId) {
        actions.getClass();
        return new CustomerRequestData(actions, channel, redirectUri, referenceId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerRequestData)) {
            return false;
        }
        CustomerRequestData customerRequestData = (CustomerRequestData) obj;
        return Intrinsics.areEqual(this.f4654a, customerRequestData.f4654a) && Intrinsics.areEqual(this.f4655b, customerRequestData.f4655b) && Intrinsics.areEqual(this.f4656c, customerRequestData.f4656c) && Intrinsics.areEqual(this.f4657d, customerRequestData.f4657d);
    }

    public final int hashCode() {
        int iHashCode = this.f4654a.hashCode() * 31;
        String str = this.f4655b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f4656c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f4657d;
        return iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "CustomerRequestData(actions=" + this.f4654a + ", channel=" + this.f4655b + ", redirectUri=" + this.f4656c + ", referenceId=" + this.f4657d + ")";
    }
}
