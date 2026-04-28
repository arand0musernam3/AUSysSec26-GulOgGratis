package zendesk.conversationkit.android.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lzendesk/conversationkit/android/model/App;", "", "id", "", "status", "name", "isMultiConvoEnabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getStatus", "getName", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class App {

    @NotNull
    private final String id;
    private final boolean isMultiConvoEnabled;

    @NotNull
    private final String name;

    @NotNull
    private final String status;

    public App(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11) {
        a0.C(str, str2, str3);
        this.id = str;
        this.status = str2;
        this.name = str3;
        this.isMultiConvoEnabled = z11;
    }

    public static /* synthetic */ App copy$default(App app2, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = app2.id;
        }
        if ((i11 & 2) != 0) {
            str2 = app2.status;
        }
        if ((i11 & 4) != 0) {
            str3 = app2.name;
        }
        if ((i11 & 8) != 0) {
            z11 = app2.isMultiConvoEnabled;
        }
        return app2.copy(str, str2, str3, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMultiConvoEnabled() {
        return this.isMultiConvoEnabled;
    }

    @NotNull
    public final App copy(@NotNull String id2, @NotNull String status, @NotNull String name, boolean isMultiConvoEnabled) {
        id2.getClass();
        status.getClass();
        name.getClass();
        return new App(id2, status, name, isMultiConvoEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof App)) {
            return false;
        }
        App app2 = (App) other;
        return Intrinsics.areEqual(this.id, app2.id) && Intrinsics.areEqual(this.status, app2.status) && Intrinsics.areEqual(this.name, app2.name) && this.isMultiConvoEnabled == app2.isMultiConvoEnabled;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isMultiConvoEnabled) + l1.b(l1.b(this.id.hashCode() * 31, 31, this.status), 31, this.name);
    }

    public final boolean isMultiConvoEnabled() {
        return this.isMultiConvoEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.status;
        String str3 = this.name;
        boolean z11 = this.isMultiConvoEnabled;
        StringBuilder sbT = f.t("App(id=", str, ", status=", str2, ", name=");
        sbT.append(str3);
        sbT.append(", isMultiConvoEnabled=");
        sbT.append(z11);
        sbT.append(")");
        return sbT.toString();
    }
}
