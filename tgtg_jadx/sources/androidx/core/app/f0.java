package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2597a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2598b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f2599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f2600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f2601e;

    public f0(y0 y0Var) {
        if (TextUtils.isEmpty(y0Var.f2711a)) {
            i4.a.f("User's name must not be empty.");
            throw null;
        }
        this.f2599c = y0Var;
    }

    @Override // androidx.core.app.l0
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f2599c.f2711a);
        bundle.putBundle("android.messagingStyleUser", this.f2599c.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f2600d);
        if (this.f2600d != null && this.f2601e.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f2600d);
        }
        ArrayList arrayList = this.f2597a;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", e0.a(arrayList));
        }
        ArrayList arrayList2 = this.f2598b;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", e0.a(arrayList2));
        }
        Boolean bool = this.f2601e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // androidx.core.app.l0
    public final void apply(i iVar) {
        Notification.MessagingStyle messagingStyleB;
        s sVar = this.mBuilder;
        boolean zBooleanValue = false;
        if (sVar == null || sVar.f2664a.getApplicationInfo().targetSdkVersion >= 28 || this.f2601e != null) {
            Boolean bool = this.f2601e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.f2600d != null) {
            zBooleanValue = true;
        }
        this.f2601e = Boolean.valueOf(zBooleanValue);
        int i11 = Build.VERSION.SDK_INT;
        y0 y0Var = this.f2599c;
        if (i11 >= 28) {
            y0Var.getClass();
            messagingStyleB = b0.a(l.h(y0Var));
        } else {
            messagingStyleB = z.b(y0Var.f2711a);
        }
        Iterator it = this.f2597a.iterator();
        while (it.hasNext()) {
            z.a(messagingStyleB, ((e0) it.next()).c());
        }
        Iterator it2 = this.f2598b.iterator();
        while (it2.hasNext()) {
            a0.a(messagingStyleB, ((e0) it2.next()).c());
        }
        if (this.f2601e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            z.c(messagingStyleB, this.f2600d);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            b0.b(messagingStyleB, this.f2601e.booleanValue());
        }
        messagingStyleB.setBuilder(((o0) iVar).f2650b);
    }

    @Override // androidx.core.app.l0
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // androidx.core.app.l0
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // androidx.core.app.l0
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.f2597a;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f2599c = y0.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            y0 y0Var = new y0();
            y0Var.f2711a = string;
            y0Var.f2712b = null;
            y0Var.f2713c = null;
            y0Var.f2714d = null;
            y0Var.f2715e = false;
            y0Var.f2716f = false;
            this.f2599c = y0Var;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f2600d = charSequence;
        if (charSequence == null) {
            this.f2600d = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(e0.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f2598b.addAll(e0.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f2601e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public f0() {
    }
}
