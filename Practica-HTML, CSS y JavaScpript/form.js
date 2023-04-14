function submitForm(event) {
	event.preventDefault();
	const name = document.getElementById('name').value;
	const height = document.getElementById('height').value;
	const weight = document.getElementById('weight').value;
	const kills = document.getElementById('kills').value;
	if (name && height && weight && kills) {
		const zombie = { name, height, weight, kills };
		const zombies = JSON.parse(localStorage.getItem('zombies') || '[]');
		zombies.push(zombie);
		zombies.sort((a, b) => b.kills - a.kills);
		localStorage.setItem('zombies', JSON.stringify(zombies));
		updateTop10List(zombies);
		updatePieChart(zombies);
		document.getElementById('name').value = '';
		document.getElementById('height').value = '';
		document.getElementById('weight').value = '';
		document.getElementById('kills').value = '';}}
