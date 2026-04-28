package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import u70.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NameResolverImpl implements NameResolver {

    @NotNull
    private final ProtoBuf.QualifiedNameTable qualifiedNames;

    @NotNull
    private final ProtoBuf.StringTable strings;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(@NotNull ProtoBuf.StringTable stringTable, @NotNull ProtoBuf.QualifiedNameTable qualifiedNameTable) {
        stringTable.getClass();
        qualifiedNameTable.getClass();
        this.strings = stringTable;
        this.qualifiedNames = qualifiedNameTable;
    }

    private final u traverseIds(int i11) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z11 = false;
        while (i11 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.qualifiedNames.getQualifiedName(i11);
            String string = this.strings.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            int i12 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i12 == 1) {
                linkedList2.addFirst(string);
            } else if (i12 == 2) {
                linkedList.addFirst(string);
            } else if (i12 == 3) {
                linkedList2.addFirst(string);
                z11 = true;
            }
            i11 = qualifiedName.getParentQualifiedName();
        }
        return new u(linkedList, linkedList2, Boolean.valueOf(z11));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i11) {
        u uVarTraverseIds = traverseIds(i11);
        List list = (List) uVarTraverseIds.f40859a;
        String strU = CollectionsKt.U((List) uVarTraverseIds.f40860b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strU;
        }
        return CollectionsKt.U(list, ExpiryDateInput.SEPARATOR, null, null, null, 62) + '/' + strU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i11) {
        String string = this.strings.getString(i11);
        string.getClass();
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i11) {
        return ((Boolean) traverseIds(i11).f40861c).booleanValue();
    }
}
