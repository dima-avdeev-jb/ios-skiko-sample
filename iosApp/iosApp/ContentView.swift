import SwiftUI
import UIKit
import shared

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
		ComposeInSwiftUI()
	}
}

struct ComposeInSwiftUI: UIViewControllerRepresentable {

    func makeUIViewController(context: Context) -> UIViewController {
        return SwiftHelper().getViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {

    }
}