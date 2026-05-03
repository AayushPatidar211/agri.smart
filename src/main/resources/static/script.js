const API = "http://localhost:8080/api";

async function submitSoilTest() {
    const soilTest = {
        farmerName: document.getElementById("farmerName").value,
        city: document.getElementById("city").value,
        phValue: Number(document.getElementById("phValue").value),
        nitrogen: Number(document.getElementById("nitrogen").value),
        phosphorus: Number(document.getElementById("phosphorus").value),
        potassium: Number(document.getElementById("potassium").value),
        soilType: document.getElementById("soilType").value
    };

    const response = await fetch(`${API}/soil/test`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(soilTest)
    });

    const data = await response.json();

    document.getElementById("soilResult").innerHTML = `
        <div class="policy">
            <h3>Recommendation</h3>
            <p>${data.recommendation}</p>
        </div>
    `;
}

async function loadFertilizers() {
    const response = await fetch(`${API}/fertilizers`);
    const fertilizers = await response.json();

    const list = document.getElementById("fertilizerList");
    list.innerHTML = "";

    fertilizers.forEach(item => {
        list.innerHTML += `
            <div class="product">
                <h3>${item.fertilizerName}</h3>
                <p>${item.category}</p>
                <p>Suitable For: ${item.suitableFor}</p>
                <p class="price">₹${item.price}</p>
                <p>Stock: ${item.stock}</p>
                <button>Buy Now</button>
            </div>
        `;
    });
}

async function loadMandiRates() {
    const city = document.getElementById("mandiCity").value;

    const response = await fetch(`${API}/mandi/city/${city}`);
    const rates = await response.json();

    const table = document.getElementById("mandiTable");
    table.innerHTML = "";

    rates.forEach(rate => {
        table.innerHTML += `
            <tr>
                <td>${rate.city}</td>
                <td>${rate.mandiName}</td>
                <td>${rate.cropName}</td>
                <td>₹${rate.minPrice}</td>
                <td>₹${rate.maxPrice}</td>
                <td>₹${rate.modalPrice}</td>
                <td>${rate.rateDate}</td>
            </tr>
        `;
    });
}

async function loadPolicies() {
    const response = await fetch(`${API}/policies`);
    const policies = await response.json();

    const list = document.getElementById("policyList");
    list.innerHTML = "";

    policies.forEach(policy => {
        list.innerHTML += `
            <div class="policy">
                <h3>${policy.title}</h3>
                <p><b>Category:</b> ${policy.category}</p>
                <p>${policy.description}</p>
                <a href="${policy.officialLink}" target="_blank">Official Link</a>
            </div>
        `;
    });
}

loadFertilizers();
loadPolicies();