package zendesk.messaging.android.internal;

import androidx.lifecycle.c1;
import k80.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import n90.b;
import n90.c;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.MessagingScreen;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lzendesk/messaging/android/internal/SavedStateHandleDelegate;", "T", "Lk80/d;", "Landroidx/lifecycle/c1;", "", "key", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "MessagingScreenDelegate", "Lzendesk/messaging/android/internal/SavedStateHandleDelegate$MessagingScreenDelegate;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SavedStateHandleDelegate<T> implements d {

    @NotNull
    private final String key;

    private SavedStateHandleDelegate(String str) {
        this.key = str;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Override // k80.c
    public abstract /* synthetic */ Object getValue(Object obj, @NotNull KProperty kProperty);

    @Override // k80.d
    public abstract /* synthetic */ void setValue(Object obj, @NotNull KProperty kProperty, Object obj2);

    public /* synthetic */ SavedStateHandleDelegate(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzendesk/messaging/android/internal/SavedStateHandleDelegate$MessagingScreenDelegate;", "Lzendesk/messaging/android/internal/SavedStateHandleDelegate;", "Lzendesk/android/messaging/MessagingScreen;", "", "key", "defaultValue", "<init>", "(Ljava/lang/String;Lzendesk/android/messaging/MessagingScreen;)V", "Landroidx/lifecycle/c1;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroidx/lifecycle/c1;Lkotlin/reflect/KProperty;)Lzendesk/android/messaging/MessagingScreen;", "value", "", "setValue", "(Landroidx/lifecycle/c1;Lkotlin/reflect/KProperty;Lzendesk/android/messaging/MessagingScreen;)V", "Lzendesk/android/messaging/MessagingScreen;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MessagingScreenDelegate extends SavedStateHandleDelegate<MessagingScreen> {

        @NotNull
        private final MessagingScreen defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagingScreenDelegate(@NotNull String str, @NotNull MessagingScreen messagingScreen) {
            super(str, null);
            str.getClass();
            messagingScreen.getClass();
            this.defaultValue = messagingScreen;
        }

        @NotNull
        public MessagingScreen getValue(@NotNull c1 thisRef, @NotNull KProperty<?> property) {
            thisRef.getClass();
            property.getClass();
            b bVar = c.f30748d;
            MessagingScreen.Companion companion = MessagingScreen.INSTANCE;
            String strC = bVar.c(companion.serializer(), this.defaultValue);
            String key = getKey();
            key.getClass();
            String str = (String) thisRef.b(key, null, false).d();
            if (str != null) {
                strC = str;
            }
            try {
                return (MessagingScreen) bVar.b(companion.serializer(), strC);
            } catch (Exception unused) {
                return this.defaultValue;
            }
        }

        public void setValue(@NotNull c1 thisRef, @NotNull KProperty<?> property, @NotNull MessagingScreen value) {
            thisRef.getClass();
            property.getClass();
            value.getClass();
            thisRef.d(c.f30748d.c(MessagingScreen.INSTANCE.serializer(), value), getKey());
        }

        @Override // zendesk.messaging.android.internal.SavedStateHandleDelegate, k80.d
        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((c1) obj, (KProperty<?>) kProperty, (MessagingScreen) obj2);
        }

        @Override // zendesk.messaging.android.internal.SavedStateHandleDelegate, k80.c
        public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
            return getValue((c1) obj, (KProperty<?>) kProperty);
        }
    }
}
