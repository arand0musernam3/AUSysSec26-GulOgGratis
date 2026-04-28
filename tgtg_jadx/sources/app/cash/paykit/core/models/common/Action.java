package app.cash.paykit.core.models.common;

import a60.i;
import a60.l;
import fc.a;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJH\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lapp/cash/paykit/core/models/common/Action;", "", "", "amount_cents", "", "currency", "scopeId", "type", "Lfc/a;", "accountReferenceId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;)Lapp/cash/paykit/core/models/common/Action;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4641e;

    public /* synthetic */ Action(Integer num, String str, String str2, String str3, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, str2, str3, (i11 & 16) != 0 ? null : aVar);
    }

    @NotNull
    public final Action copy(@i(name = "amount") @Nullable Integer amount_cents, @i(name = "currency") @Nullable String currency, @i(name = "scope_id") @NotNull String scopeId, @i(name = "type") @NotNull String type, @i(name = "account_reference_id") @Nullable a accountReferenceId) {
        scopeId.getClass();
        type.getClass();
        return new Action(amount_cents, currency, scopeId, type, accountReferenceId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(this.f4637a, action.f4637a) && Intrinsics.areEqual(this.f4638b, action.f4638b) && Intrinsics.areEqual(this.f4639c, action.f4639c) && Intrinsics.areEqual(this.f4640d, action.f4640d) && Intrinsics.areEqual(this.f4641e, action.f4641e);
    }

    public final int hashCode() {
        Integer num = this.f4637a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f4638b;
        int iB = l1.b(l1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f4639c), 31, this.f4640d);
        a aVar = this.f4641e;
        return iB + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Action(amount_cents=");
        sb2.append(this.f4637a);
        sb2.append(", currency=");
        sb2.append(this.f4638b);
        sb2.append(", scopeId=");
        s.A(sb2, this.f4639c, ", type=", this.f4640d, ", accountReferenceId=");
        sb2.append(this.f4641e);
        sb2.append(")");
        return sb2.toString();
    }

    public Action(@i(name = "amount") @Nullable Integer num, @i(name = "currency") @Nullable String str, @i(name = "scope_id") @NotNull String str2, @i(name = "type") @NotNull String str3, @i(name = "account_reference_id") @Nullable a aVar) {
        str2.getClass();
        str3.getClass();
        this.f4637a = num;
        this.f4638b = str;
        this.f4639c = str2;
        this.f4640d = str3;
        this.f4641e = aVar;
    }
}
