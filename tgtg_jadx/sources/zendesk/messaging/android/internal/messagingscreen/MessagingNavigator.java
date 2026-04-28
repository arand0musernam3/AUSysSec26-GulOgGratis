package zendesk.messaging.android.internal.messagingscreen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J(\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentContainer", "", "<init>", "(Landroidx/fragment/app/FragmentManager;I)V", "navigateToScreen", "", "fragment", "Landroidx/fragment/app/Fragment;", "tagName", "", "addToBackStack", "", "transactionBehaviour", "Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator$TransactionBehaviour;", "navigate", "fragmentTagName", "popBackScreenIfDisplayed", "hasScreenBeenDisplayed", "popBackCurrentScreen", "TransactionBehaviour", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessagingNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingNavigator.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingNavigator\n+ 2 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,118:1\n28#2,12:119\n*S KotlinDebug\n*F\n+ 1 MessagingNavigator.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingNavigator\n*L\n57#1:119,12\n*E\n"})
public final class MessagingNavigator {
    private final int fragmentContainer;

    @NotNull
    private final FragmentManager supportFragmentManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator$TransactionBehaviour;", "", "<init>", "(Ljava/lang/String;I)V", "REPLACE", "ADD", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransactionBehaviour {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ TransactionBehaviour[] $VALUES;
        public static final TransactionBehaviour REPLACE = new TransactionBehaviour("REPLACE", 0);
        public static final TransactionBehaviour ADD = new TransactionBehaviour("ADD", 1);

        private static final /* synthetic */ TransactionBehaviour[] $values() {
            return new TransactionBehaviour[]{REPLACE, ADD};
        }

        static {
            TransactionBehaviour[] transactionBehaviourArr$values = $values();
            $VALUES = transactionBehaviourArr$values;
            $ENTRIES = n.w(transactionBehaviourArr$values);
        }

        private TransactionBehaviour(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static TransactionBehaviour valueOf(String str) {
            return (TransactionBehaviour) Enum.valueOf(TransactionBehaviour.class, str);
        }

        public static TransactionBehaviour[] values() {
            return (TransactionBehaviour[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionBehaviour.values().length];
            try {
                iArr[TransactionBehaviour.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionBehaviour.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MessagingNavigator(@NotNull FragmentManager fragmentManager, int i11) {
        fragmentManager.getClass();
        this.supportFragmentManager = fragmentManager;
        this.fragmentContainer = i11;
    }

    private final void navigate(Fragment fragment, String fragmentTagName, boolean addToBackStack, TransactionBehaviour transactionBehaviour) {
        popBackScreenIfDisplayed(fragmentTagName);
        FragmentManager fragmentManager = this.supportFragmentManager;
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.f3409p = true;
        int i11 = WhenMappings.$EnumSwitchMapping$0[transactionBehaviour.ordinal()];
        if (i11 == 1) {
            aVar.e(this.fragmentContainer, fragment, fragmentTagName, 1);
        } else {
            if (i11 != 2) {
                e40.a.f();
                return;
            }
            aVar.f(this.fragmentContainer, fragment, fragmentTagName);
        }
        if (addToBackStack) {
            aVar.c(fragmentTagName);
        }
        aVar.d();
    }

    public static /* synthetic */ void navigateToScreen$default(MessagingNavigator messagingNavigator, Fragment fragment, String str, boolean z11, TransactionBehaviour transactionBehaviour, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            transactionBehaviour = TransactionBehaviour.REPLACE;
        }
        messagingNavigator.navigateToScreen(fragment, str, z11, transactionBehaviour);
    }

    private final void popBackScreenIfDisplayed(String tagName) {
        if (hasScreenBeenDisplayed(tagName) && Intrinsics.areEqual(tagName, "ConversationFragment")) {
            popBackCurrentScreen(tagName);
        }
    }

    public final boolean hasScreenBeenDisplayed(@NotNull String tagName) {
        tagName.getClass();
        return this.supportFragmentManager.findFragmentByTag(tagName) != null;
    }

    public final void navigateToScreen(@NotNull Fragment fragment, @NotNull String tagName, boolean addToBackStack, @NotNull TransactionBehaviour transactionBehaviour) {
        fragment.getClass();
        tagName.getClass();
        transactionBehaviour.getClass();
        navigate(fragment, tagName, addToBackStack, transactionBehaviour);
    }

    public final void popBackCurrentScreen(@NotNull String tagName) {
        tagName.getClass();
        FragmentManager fragmentManager = this.supportFragmentManager;
        fragmentManager.getClass();
        fragmentManager.y(new k1(fragmentManager, tagName, -1), false);
    }
}
